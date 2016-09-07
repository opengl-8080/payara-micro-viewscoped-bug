package test;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ViewScopedBean implements Serializable {

    private String queryParameter;

    public void init() {
        System.out.println("queryParameter = " + this.queryParameter);
    }

    public void setQueryParameter(String queryParameter) {
        this.queryParameter = queryParameter;
    }

    public String getQueryParameter() {
        return queryParameter;
    }
}
