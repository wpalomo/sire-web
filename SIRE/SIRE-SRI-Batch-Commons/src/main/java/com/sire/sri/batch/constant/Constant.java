/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sire.sri.batch.constant;

/**
 *
 * @author pestupinan
 */
public class Constant {

    public final static String FACTURA_C_SQL = "SELECT COD_EMPRESA, RUC_EMPRESA, RAZON_SOCIAL_EMPRESA, "
            + "NOMBRE_COMERCIAL, COD_DOCUMENTO, NUM_FACTURA_INTERNO, ESTABLECIMIENTO, "
            + "PUNTO_EMISION, SECUENCIAL, DIRECCION_MATRIZ, DIRECCION_ESTABLECIMIENTO, "
            + "CONTRIBUYENTE_ESPECIAL, LLEVA_CONTABILIDAD, RAZON_SOCIAL_COMPRADOR, "
            + "FECHA_FACTURA, TIPO_IDENTIFICACION_COMPRADOR, IDENTIFICACION_COMPRADOR, "
            + "DIRECCION_COMPRADOR, TELEFONO_COMPRADOR, EMAIL_COMPRADOR, "
            + "TOTAL_SIN_IMPUESTOS, TOTAL_DESCUENTOS, PROPINA, IMPORTE_TOTAL, "
            + "CLAVE_ACCESO, CODIGO_IMPUESTO, CODIGO_PORCENTAJE, BASE_IMPONIBLE, "
            + "VALOR, MONEDA, OBSERVACION, BASE_IMPONIBLE_SIN_IVA, CODIGO_IMPUESTO_SIN_IVA, "
            + "CODIGO_PORCENTAJE_SIN_IVA, TARIFA_IVA_SIN_IVA, VALOR_IVA_SIN_IVA "
            + "FROM ";

    public final static String FACTURA_D_SQL = "SELECT COD_EMPRESA, COD_DOCUMENTO, "
            + "NUM_DOCUMENTO_INTERNO, COD_ARTICULO, NOMBRE_ARTICULO, CANTIDAD, "
            + "PRECIO_UNITARIO, DESCUENTO, CODIGO_IMPUESTO, CODIGO_PORCENTAJE, TARIFA, "
            + "BASE_IMPONIBLE, VALOR, PRECIO_TOTAL_SIN_IMPUESTOS "
            + "FROM V_FACTURA_ELECTRONICA_D "
            + "WHERE ";

    public final static String FACTURA_PAGO_SQL = "SELECT CODIGO, FORMA_PAGO, PLAZO, TIEMPO, "
            + "VALOR_FORMA_PAGO "
            + "FROM V_FACTURA_ELECTRONICA_PAGO "
            + "WHERE ";

    public final static String RETENCION_C_SQL = "SELECT COD_EMPRESA, RUC_EMPRESA, RAZON_SOCIAL_EMPRESA, "
            + "NOMBRE_COMERCIAL, COD_DOCUMENTO, NUM_RETENCION_INTERNO, CLAVE_ACCESO, "
            + "ESTABLECIMIENTO, PUNTO_EMISION, SECUENCIAL, DIRECCION_MATRIZ, "
            + "DIRECCION_ESTABLECIMIENTO, CONTRIBUYENTE_ESPECIAL, LLEVA_CONTABILIDAD, "
            + "RAZON_SOCIAL_SUJETO_RETENIDO, DIRECCION_RETENIDO, TELEFONO_RETENIDO, "
            + "EMAIL_RETENIDO, FECHA_RETENCION, TIPO_IDENT_SUJETO_RETENIDO, "
            + "IDENTIFICACION_SUJETO_RETENIDO, PERIODO_FISCAL, ESTADO_SRI, "
            + "CLAVE_ACCESO_LOTE "
            + "FROM V_RETENCION_ELECTRONICA_C "
            + "WHERE ";

    public final static String RETENCION_D_SQL = "SELECT CODIGO, CODIGORETENCION, "
            + "BASEIMPONIBLE, PORCENTAJERETENR, VALORRETENIDO, CODDOCSUSTENTO, "
            + "NUMDOCSUSTENTO, FECHAEMISIONDOCSUSTENTO "
            + "FROM V_RETENCION_ELECTRONICA_D "
            + "WHERE ";

    public final static String NOTA_CREDITO_C_SQL = "SELECT COD_EMPRESA, RUC_EMPRESA, "
            + "RAZON_SOCIAL_EMPRESA, NOMBRE_COMERCIAL, COD_DOCUMENTO, NUM_FACTURA_INTERNO, "
            + "CLAVE_ACCESO, ESTABLECIMIENTO, PUNTO_EMISION, SECUENCIAL, DIRECCION_MATRIZ, "
            + "DIRECCION_ESTABLECIMIENTO, CONTRIBUYENTE_ESPECIAL, LLEVA_CONTABILIDAD, RISE, "
            + "RAZON_SOCIAL_COMPRADOR, DIRECCION_COMPRADOR, TELEFONO_COMPRADOR, "
            + "EMAIL_COMPRADOR, OBSERVACION, FECHA_EMISION, TIPO_IDENTIFICACION_COMPRADOR, "
            + "IDENTIFICACION_COMPRADOR, COD_DOC_MODIFICADO, NUM_DOC_MODIFICADO, "
            + "FECHA_EMISION_DOCSUSTENTO, VALOR_MODIFICADO, TOTAL_SIN_IMPUESTOS, "
            + "MOTIVO, TOTAL_DESCUENTOS, PROPINA, IMPORTE_TOTAL, CODIGO_IMPUESTO, "
            + "CODIGO_PORCENTAJE, BASE_IMPONIBLE, VALOR, MONEDA, ESTADO_SRI, "
            + "CLAVE_ACCESO_LOTE "
            + "FROM V_NOTA_CREDITO_ELECTRONICA_C "
            + "WHERE ";

    public final static String NOTA_CREDITO_D_SQL = "SELECT COD_EMPRESA, COD_DOCUMENTO, "
            + "NUM_DOCUMENTO_INTERNO, COD_ARTICULO, NOMBRE_ARTICULO, CANTIDAD, "
            + "PRECIO_UNITARIO, DESCUENTO, CODIGO_IMPUESTO, CODIGO_PORCENTAJE, TARIFA, "
            + "BASE_IMPONIBLE, VALOR, PRECIO_TOTAL_SIN_IMPUESTOS "
            + "FROM V_NOTA_CREDITO_ELECTRONICA_D "
            + "WHERE ";

    public final static String NOTA_DEBITO_SQL = "SELECT COD_EMPRESA, RUC_EMPRESA, "
            + "RAZON_SOCIAL_EMPRESA, NOMBRE_COMERCIAL, COD_DOCUMENTO, "
            + "NUM_DOCUMENTO_INTERNO, CLAVE_ACCESO, ESTABLECIMIENTO, "
            + "PUNTO_EMISION, SECUENCIAL, DIRECCION_MATRIZ, "
            + "DIRECCION_ESTABLECIMIENTO, CONTRIBUYENTE_ESPECIAL, "
            + "LLEVA_CONTABILIDAD, RISE, RAZON_SOCIAL_COMPRADOR, "
            + "DIRECCION_COMPRADOR, TELEFONO_COMPRADOR, EMAIL_COMPRADOR, "
            + "OBSERVACION, FECHA_EMISION, TIPO_IDENTIFICACION_COMPRADOR, "
            + "IDENTIFICACION_COMPRADOR, COD_DOC_MODIFICADO, NUM_DOC_MODIFICADO, "
            + "FECHA_EMISION_DOCSUSTENTO, TOTAL_SIN_IMPUESTOS, CODIGO_IMPUESTO, "
            + "CODIGO_PORCENTAJE, TARIFA, BASE_IMPONIBLE, VALOR, ESTADO_SRI, "
            + "CLAVE_ACCESO_LOTE, VALOR_TOTAL "
            + "FROM V_NOTA_DEBITO_ELECTRONICA_C "
            + "WHERE ";

    public final static String NOTA_DEBITO_PAGO_SQL = "SELECT COD_EMPRESA, "
            + "NUM_DOCUMENTO_INTERNO, CODIGO, FORMA_PAGO, PLAZO, TIEMPO, VALOR_FORMA_PAGO "
            + "FROM V_NOTA_DEBITO_ELECTRONICA_PAGO "
            + "WHERE ";

    public final static String GUIA_REMISION_C_SQL = "SELECT COD_EMPRESA, RUC_EMPRESA, "
            + "RAZON_SOCIAL_EMPRESA, NOMBRE_COMERCIAL, COD_DOCUMENTO, "
            + "NUM_DESPACHO_INTERNO, CLAVE_ACCESO, ESTABLECIMIENTO, "
            + "PUNTO_EMISION, SECUENCIAL, DIRECCION_MATRIZ, DIRECCION_ESTABLECIMIENTO, "
            + "CONTRIBUYENTE_ESPECIAL, LLEVA_CONTABILIDAD, RAZON_SOCIAL_TRANSPORTISTA, "
            + "TIPO_IDENT_TRANSPORTISTA, RUC_TRANSPORTISTA, RISE, DIR_PARTIDA, "
            + "FECHA_INICIO_TRANSPORTE, FECHA_FIN_TRANSPORTE, PLACA, ESTADO_SRI, "
            + "CLAVE_ACCESO_LOTE "
            + "FROM V_GUIA_REMISION_ELECTRONICA_C "
            + "WHERE ";

    public final static String GUIA_REMISION_D_SQL = "SELECT NUM_DESPACHO_INTERNO, "
            + "IDENTIFICACION_DESTINATARIO, RAZONSOCIALDESTINATARIO, DIRDESTINATARIO, "
            + "TELDESTINATARIO, MAILDESTINATARIO, MOTIVOTRASLADO, DOCADUANEROUNICO, "
            + "RUTA, COD_ESTAB_DESTINO, CODDOSUSTENTO, NUMDOCSUSTENTO, NUMAUTDOCSUSTENTO, "
            + "FECHAEMISIONDOCSUSTENTO "
            + "FROM V_GUIA_REMISION_ELECTRONICA_D "
            + "WHERE ";

    public final static String GUIA_REMISION_ARTICULO_SQL = "SELECT NUM_DESPACHO_INTERNO, "
            + "CODIGOINTERNO, DESCRIPCION, CANTIDAD, DETALLEADICIONAL1, DETALLEADICIONAL2 "
            + "FROM V_GUIA_REMISION_ARTICULO "
            + "WHERE ";

}