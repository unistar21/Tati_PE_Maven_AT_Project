package api.classwork;

import java.util.List;

public class Data {

        public String code;
        public List<User> data;

    public Data(String code, List<User> data) {
        this.code = code;
        this.data = data;
    }

    public Data() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
