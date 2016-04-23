package main;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
public class SerializationObject implements Serializable {
    private static final long serialVersionUID = -3895203507200457732L;
    private String dialect;
    private String connection_driver_class;
    private String connection_url;
    private String hbm2ddl_auto;
    private String show_sql;
    private int maxtime;


    public SerializationObject() {
        this.dialect = "default";
        this.connection_driver_class = "default";
        this.connection_url = "default";
        this.hbm2ddl_auto = "default";
        this.show_sql = "default";
        this.maxtime = 10;
    }

    public SerializationObject(String dialect,  String connection_driver_class, String connection_url,
                               String hbm2ddl_auto, String show_sql, int maxtime) {
        this.setDialect(dialect);
        this.setConnection_driver_class(connection_driver_class);
        this.setConnection_url(connection_url);
        this.setHbm2ddl_auto(hbm2ddl_auto);
        this.setShow_sql(show_sql);
        this.setMaxtime(maxtime);
    }

    public String toString() {
        return "dialect: " + dialect + " connection_driver_class: " + connection_driver_class
                + " connection_url:" + connection_url + " hbm2ddl_auto: " + hbm2ddl_auto + " show_sql: "
                + show_sql + " maxtime: " + maxtime;
    }

    public String getDialect() {
        return dialect;
    }

    public String getConnection_driver_class() {
        return connection_driver_class;
    }

    public String getConnection_url() {
        return connection_url;
    }

    public String getHbm2ddl_auto() {
        return hbm2ddl_auto;
    }

    public String getShow_sql() {
        return show_sql;
    }


    @XmlElement
    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    @XmlElement
    public void setConnection_driver_class(String connection_driver_class) {
        this.connection_driver_class = connection_driver_class;
    }

    @XmlElement
     public void setConnection_url(String connection_url) {
        this.connection_url = connection_url;
    }

    @XmlElement
    public void setHbm2ddl_auto(String hbm2ddl_auto) {
        this.hbm2ddl_auto = hbm2ddl_auto;
    }

    @XmlElement
    public void setShow_sql(String show_sql) {
        this.show_sql = show_sql;
    }


    public int getMaxtime() {
        return maxtime;
    }

    @XmlElement
    public void setMaxtime(int maxtime) {
        this.maxtime = maxtime;
    }
}
