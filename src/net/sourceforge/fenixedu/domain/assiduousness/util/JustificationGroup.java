package net.sourceforge.fenixedu.domain.assiduousness.util;

public enum JustificationGroup {
    SICKNESS, CURRENT_YEAR_HOLIDAYS, LAST_YEAR_HOLIDAYS, NEXT_YEAR_HOLIDAYS, UNPAID_LICENCES, TOLERANCES, GOVERNMENT_TOLERANCES, MATERNITY, ABSENCES, IST_INTERNAL_JUSTIFICATIONS;

    public boolean isVacation() {
	return this == CURRENT_YEAR_HOLIDAYS || this == LAST_YEAR_HOLIDAYS || this == NEXT_YEAR_HOLIDAYS;
    }
}
