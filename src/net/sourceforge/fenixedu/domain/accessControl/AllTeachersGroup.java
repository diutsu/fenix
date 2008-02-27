package net.sourceforge.fenixedu.domain.accessControl;

import net.sourceforge.fenixedu.domain.person.RoleType;
import net.sourceforge.fenixedu.renderers.utils.RenderUtils;

public class AllTeachersGroup extends RoleTypeGroup {

    public AllTeachersGroup() {
	super(RoleType.TEACHER);
    }

    @Override
	public String getName() {
		return RenderUtils.getResourceString("GROUP_NAME_RESOURCES", "label.name." + getClass().getSimpleName());
	}
}
