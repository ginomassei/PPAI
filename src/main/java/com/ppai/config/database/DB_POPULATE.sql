INSERT INTO CARACTERISTICAS_RT (NOMBRE, DESCRIPCION)
VALUES ('Capacidad', 'Capacidad del recurso.'),
        ('Indicación minima', 'Minima precisión del dispositivo.'),
        ('Repetitividad', 'Valor mínimo de repetitividad.'),
        ('Linealidad', '??'),
        ('Tiempo de respuesta', 'Tiempo en que el dispositivo brinda una respuesta.'),
        ('Monitor', 'Tipo del panel de monitor.'),
        ('Dimensiones del plato de la balanza', 'Tamaño del área de pesaje.'),
        ('Contador con lectura', ''),
        ('Velocidad de enfoque', 'Tiempo que demora el microscopio en brindar una imagen nítida.'),
        ('Repetibilidad del enfoque', ''),
        ('Velocidad de movimiento vertical', ''),
        ('Platina', '');

INSERT INTO CENTROS_DE_INVESTICACION
    (NOMBRE,
     SIGLA,
     DIRECCION,
     TELEFONO,
     CORREO_ELECTRONICO,
     TIEMPO_PREVIO_RESERVA,
     FECHA_INICIO,
     FECHA_BAJA,
     MOTIVO_BAJA,
     NRO_RESOLUCION,
     FEHA_RESOLUCION,
     REGLAMENTO,
     FECHA_ALTA
     )
VALUES
    (
        'Centro tecnológico Manuel Belgrano',
        'MAB01',
        'Av. Leopoldo Lugones 215',
        '3516112578',
        'ctmab@ct.com',
        '3 dias habiles',
        '2002-20-11',
        null,
        null,
        null,
        'Reglamento en revision',
        '2004-03-04'
    ),
    (
        'Centro tecnológico Chinfunfis',
        'CHINF04',
        'Rondeau 392',
        '4332413443',
        'chinfus@ct.com',
        '1 dia habil',
        '2012-11-09',
        null,
        null,
        12349,
        'Reglamento en revision',
        '2019-03-04'
    );

INSERT INTO ESTADOS (NOMBRE)
VALUES  ('DISPONIBLE'), ('MANTEMIENTO'), ('MANTENIMIENTO CORRECTIVO');