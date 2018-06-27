-- Habilitamos la salida de información en pantalla.
SET SERVEROUTPUT ON;
-- Declaramos el bloque de código (DECLARE, BEGIN END).
DECLARE
-- Declaramos la variable de sustitución año bisiesto.
  año NUMBER(4) := &comprobar_año_bisiesto;
BEGIN
/*Creamos una condición if, que si se cumple el valor introducido es un año bisiesto,en esta 
condición comprobamos si el valor es divisible por 400 o si es divisible por 4 y no por 100.
Si se cumple es un año bisiesto.
*/
  IF ((MOD(año, 400) = 0) OR ((MOD(año, 4) = 0) AND (MOD(año, 100) != 0) )) THEN
    DBMS_OUTPUT.PUT_LINE(año || ' es un año bisiesto.');
  ELSE
    DBMS_OUTPUT.PUT_LINE(año || ' no es un año bisiesto.');
  END IF;
END;
