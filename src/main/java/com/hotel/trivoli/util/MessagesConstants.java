package com.hotel.trivoli.util;

public class MessagesConstants {
	public static final int ERROR_FIELD_VALIDATION_CODE = 1;
	public static final String MANDATORY_FIELD = "El campo %s es obligatorio";
	public static final String MAX_VALIDATION_FIELD = "El campo %s sobrepasa la cantidad permitida";

	public static final int ENTITY_ALREADY_EXISTS_CODE = 2;
	public static final String ENTITY_ALREADY_EXISTS = "ya existe un %s con ese id";
	public static final int ENTITY_NOT_EXISTS_CODE = 3;
	public static final String ENTITY_NOT_EXISTS = "No existe un %s con ese id";

	public static final int DEFAULT_ERROR_CODE = 99;
	public static final String DEFAULT_ERROR_MESSAGE = "Error realizando la operación";

	public static final int FILE_NULL_CODE = 4;
	public static final String FILE_NULL = "File is null";

	public static final int VALIDATION_ERROR = 5;

	public static final String IDENTIFY_ALREADY_EXISTS = "La identificación y/o el correo ya se encuentra/n registrado";
	public static final String PROJECT_ALREADY_EXISTS = "El código de proyecto ya se encuentra registrado";
	public static final String IDENTIFY_ALREADY_DELETEII = "Este cliente tiene un espacio asociado. Por lo tanto, no se puede eliminar";
	public static final String IDENTIFY_ALREADY_DELETE = "Este cliente tiene espacios asociados. Por lo tanto, no se puede eliminar";
	public static final String IDENTIFY_ALREADY_EXISTS_DATAMAESTRAS = "El código de la data maestra que intenta guardar ya existe";
	public static final String NOT_GENERATE_ARPIS = "Las arpis de este proyecto ya fueron generadas";
	public static final String NOT_VALIDATE_ARPIS_APROB_PEND = "Tiene solicitudes de aprobación pendientes de generación de arpis para este proyecto, Debe rechazar o aprobar estas antes de continuar";
	public static final String NOT_DELETE_PROYECT = "Este proyecto tiene un espacio ocupado";
	public static final String NOT_DELETE_PROYECTS = "Este proyecto tiene espacios ocupados";
	public static final String NOT_DELETE_COMPANY = "Esta compañia se está usando en un proyecto";
	public static final String NOT_DELETE_COMPANYS = "Esta compañia se está usando en varios proyectos";
	public static final String VALIDATE_DATE_CONTENT = "Asegurese de que las fechas no se crucen con los registros anteriores a este tipo de contenido";
	public static final String MAX_CANT_ESPACIO = "El total de los metros cuadrados de los espacios no debe superar los disponible del proyecto";
	public static final String VALIDATE_REPORT_LIBRO_ACCIONISTAS = "No existen transacciones en este proyecto";
	public static final String NOT_DELETE_PROYECTO = "Este proyecto tiene arpis generadas";
	public static final String IDENTIFY_ESPACIO_EXISTS = "El código del espacio ya existe";
	public static final String CDNIT_ALREADY_EXISTS = "El nit que intenta registrar ya se encuentra registrado";
	public static final String NOT_DELETE_INVESMENT = "No se puede eliminar este inversionita porque tiene arpis en su poder";
	public static final String PDF_FILE_REQUIRED = "El archivo PDF es obligatario";

	private MessagesConstants() {
	}
}
