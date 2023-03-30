BEGIN TRANSACTION;

IF(
      NOT EXISTS (
      select * from INFORMATION_SCHEMA.TABLES
      where TABLE_SCHEMA='dbo' AND TABLE_NAME='Students'
      )
  )
CREATE TABLE [dbo].[Students] (
    id int NOT NULL PRIMARY KEY,
    first_name varchar(20),
    last_name varchar(50),
    age int
                               );

COMMIT TRANSACTION;