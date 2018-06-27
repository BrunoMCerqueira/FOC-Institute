-- Habilitamos la salida de información en pantalla.
SET SERVEROUTPUT ON;
-- Declaramos el bloque de código (DECLARE, BEGIN END).
DECLARE
-- Declaramos dos variables de sustitución (salario mensual y nombre y apellido).
  salario_mensual NUMBER := &introduzca_salario_mensual;
  nombre_apellido VARCHAR(30) := '&introduzca_nombre_y_apellido';
-- Declaramos las variables NUMBER incentivo y salario anual.
  incentivo NUMBER;
  salario_anual NUMBER;
BEGIN
--Calculamos el salario anual a partir del mensual.
  salario_anual := salario_mensual * 12;
-- Creamos una estructura IF, para calcular incentivo en función del salario introducido.
  IF (salario_anual <= 9999 ) THEN
    incentivo := 500;
  ELSIF (salario_anual <= 19999 ) THEN
    incentivo := 1000;
  ELSE
    incentivo := 2000;
  END IF;
-- Mostramos por pantalla los valores calculados.
  DBMS_OUTPUT.PUT_LINE('EL incentivo para el empleado ' || nombre_apellido || ' con un sueldo de '
  || salario_anual || ' es de ' || incentivo );
-- Cerramos bloque de código con END.
END;
