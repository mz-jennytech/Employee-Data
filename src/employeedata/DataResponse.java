/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;

/**
 *
 * @author jennifer.okosisi
 */
public class DataResponse {
    
    private String status;
     private Data data;

    @Override
    public String toString() {
        return "DataResponse{" + "status=" + status + ", data=" + data + '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public DataResponse(String status, Data data) {
        this.status = status;
        this.data = data;
    }
    }
    

