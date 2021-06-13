
package soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estadoEnvio.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="estadoEnvio"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pendiente"/&gt;
 *     &lt;enumeration value="Entransito"/&gt;
 *     &lt;enumeration value="Entregado"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "estadoEnvio")
@XmlEnum
public enum EstadoEnvio {

    @XmlEnumValue("Pendiente")
    PENDIENTE("Pendiente"),
    @XmlEnumValue("Entransito")
    ENTRANSITO("Entransito"),
    @XmlEnumValue("Entregado")
    ENTREGADO("Entregado");
    private final String value;

    EstadoEnvio(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoEnvio fromValue(String v) {
        for (EstadoEnvio c: EstadoEnvio.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
