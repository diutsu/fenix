/*
 * Created on 25/Mar/2003
 *
 * 
 */
package net.sourceforge.fenixedu.applicationTier.Servico.gesdis;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.fenixedu.applicationTier.Service;
import net.sourceforge.fenixedu.applicationTier.Servico.exceptions.FenixServiceException;
import net.sourceforge.fenixedu.dataTransferObject.InfoExecutionCourse;
import net.sourceforge.fenixedu.dataTransferObject.InfoTeacher;
import net.sourceforge.fenixedu.domain.Professorship;
import net.sourceforge.fenixedu.persistenceTier.ExcepcaoPersistencia;
import net.sourceforge.fenixedu.persistenceTier.IPersistentProfessorship;

/**
 * @author Jo�o Mota
 * 
 *  
 */
public class ReadTeachersByExecutionCourseProfessorship extends Service {

    public List run(InfoExecutionCourse infoExecutionCourse) throws FenixServiceException,
            ExcepcaoPersistencia {
        final IPersistentProfessorship persistentProfessorship = persistentSupport
                .getIPersistentProfessorship();
        final List<Professorship> result = persistentProfessorship
                .readByExecutionCourse(infoExecutionCourse.getIdInternal());

        final List<InfoTeacher> infoResult = new ArrayList<InfoTeacher>();
        if (result != null) {
            for (final Professorship professorship : result) {
                infoResult.add(InfoTeacher.newInfoFromDomain(professorship.getTeacher()));
            }
            return infoResult;
        }
        return result;
    }
}