create table PARTIAL_REGIME_INSTALLMENT_EXECUTION_SEMESTER (
	KEY_EXECUTION_SEMESTER int(11) not null, 
	KEY_PARTIAL_REGIME_INSTALLMENT int(11) not null,  
	primary key (KEY_EXECUTION_SEMESTER, KEY_PARTIAL_REGIME_INSTALLMENT), 
	key(KEY_EXECUTION_SEMESTER), 
	key(KEY_PARTIAL_REGIME_INSTALLMENT)) type=InnoDB;
