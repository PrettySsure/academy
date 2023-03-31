BEGIN TRANSACTION;

IF(
      NOT EXISTS (
      select * from INFORMATION_SCHEMA.TABLES
      where TABLE_SCHEMA='dbo' AND TABLE_NAME='Addresses'
      )
  )
CREATE TABLE [dbo].[Addresses] (
    id int NOT NULL PRIMARY KEY,
    address_number varchar(20),
    street varchar(50),
    ward varchar(50),
    district varchar(50),
                               );

COMMIT TRANSACTION;