-- Habilitamos la salida de informaci�n en pantalla.
SET SERVEROUTPUT ON;
-- Declaramos el bloque de c�digo (DECLARE, BEGIN END).
DECLARE
-- Declaramos la variable de sustituci�n a�o bisiesto.
  a�o NUMBER(4) := &comprobar_a�o_bisiesto;
BEGIN
/*Creamos una condici�n if, que si se cumple el valor introducido es un a�o bisiesto,en esta 
condici�n comprobamos si el valor es divisible por 400 o si es divisible por 4 y no por 100.
Si se cumple es un a�o bisiesto.
*/
  IF ((MOD(a�o, 400) = 0) OR ((MOD(a�o, 4) = 0) AND (MOD(a�o, 100) != 0) )) THEN
    DBMS_OUTPUT.PUT_LINE(a�o || ' es un a�o bisiesto.');
  ELSE
    DBMS_OUTPUT.PUT_LINE(a�o || ' no es un a�o bisiesto.');
  END IF;
END;
