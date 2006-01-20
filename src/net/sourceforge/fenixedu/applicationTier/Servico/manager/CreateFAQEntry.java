/*
 * Created on 2004/08/30
 * 
 */
package net.sourceforge.fenixedu.applicationTier.Servico.manager;

import net.sourceforge.fenixedu.applicationTier.Service;
import net.sourceforge.fenixedu.dataTransferObject.support.InfoFAQEntry;
import net.sourceforge.fenixedu.domain.DomainFactory;
import net.sourceforge.fenixedu.domain.support.FAQEntry;
import net.sourceforge.fenixedu.domain.support.FAQSection;
import net.sourceforge.fenixedu.persistenceTier.ExcepcaoPersistencia;

/**
 * @author Luis Cruz
 */
public class CreateFAQEntry extends Service {

    public void run(InfoFAQEntry infoFAQEntry) throws ExcepcaoPersistencia {
        FAQSection parentFAQSection = null;
        if (infoFAQEntry.getParentSection() != null
                && infoFAQEntry.getParentSection().getIdInternal() != null) {
            parentFAQSection = (FAQSection) persistentObject.readByOID(FAQSection.class, infoFAQEntry
                    .getParentSection().getIdInternal());
        }

        FAQEntry faqEntry = DomainFactory.makeFAQEntry();
        faqEntry.setParentSection(parentFAQSection);
        faqEntry.setQuestion(infoFAQEntry.getQuestion());
        faqEntry.setAnswer(infoFAQEntry.getAnswer());
    }

}