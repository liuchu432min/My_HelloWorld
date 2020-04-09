CREATE TABLE cips.test_batch
(
   TXN_DT               VARCHAR(8) NOT NULL,
   TXN_SN               VARCHAR(16) NOT NULL,
   CORE_TXN_DT          VARCHAR(8) NOT NULL,
   CORE_TXN_SSN         VARCHAR(30) NOT NULL,
   TXN_AMT              NUMERIC(15,2) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;