DO 
$DO$
DECLARE
  _DB TEXT := 'bookmanagementsystem';
  _USER TEXT := '[user_name]';
  _PASSWORD TEXT := '[password]';
BEGIN
  CREATE EXTENSION IF NOT EXISTS DBLINK; -- ENABLE EXTENSION 
  IF EXISTS (SELECT 1 FROM PG_DATABASE WHERE DATNAME = _DB) THEN
    RAISE NOTICE 'DATABASE ALREADY EXISTS';
  ELSE
    PERFORM DBLINK_CONNECT('HOST=LOCALHOST USER=' || _USER || ' PASSWORD=' || _PASSWORD || ' DBNAME=' || CURRENT_DATABASE());
    PERFORM DBLINK_EXEC('CREATE DATABASE ' || _DB || ' TEMPLATE TEMPLATE0 ');
  END IF;
END
$DO$