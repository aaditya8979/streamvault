package me.goldze.mvvmhabit.http;

import java.io.Serializable;
import zp.p;

/* JADX INFO: loaded from: classes2.dex */
public class BaseResponse<T> implements Serializable {
    private int code;
    private String message;
    private T result;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getResult() {
        return this.result;
    }

    public boolean isOk() {
        return this.code == 10000;
    }

    public void setCode(int i10) {
        this.code = i10;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setResult(T t10) {
        this.result = t10;
    }

    public void showMessage() {
        p.c(this.message);
    }

    public String toString() {
        return "BaseResponse{code=" + this.code + ", message='" + this.message + "', result=" + this.result + '}';
    }
}
