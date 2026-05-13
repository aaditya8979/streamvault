package org.fourthline.cling.model.message;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.Z7;
import lr.d;

/* JADX INFO: loaded from: classes8.dex */
public class UpnpResponse extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f76843c;

    public enum Status {
        OK(200, "OK"),
        BAD_REQUEST(400, "Bad Request"),
        NOT_FOUND(404, "Not Found"),
        METHOD_NOT_SUPPORTED(405, "Method Not Supported"),
        PRECONDITION_FAILED(TTAdConstant.IMAGE_URL_CODE, "Precondition Failed"),
        UNSUPPORTED_MEDIA_TYPE(TTAdConstant.VIDEO_COVER_URL_CODE, "Unsupported Media Type"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
        NOT_IMPLEMENTED(501, "Not Implemented");

        private int statusCode;
        private String statusMsg;

        Status(int i10, String str) {
            this.statusCode = i10;
            this.statusMsg = str;
        }

        public static Status getByStatusCode(int i10) {
            for (Status status : values()) {
                if (status.getStatusCode() == i10) {
                    return status;
                }
            }
            return null;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public String getStatusMsg() {
            return this.statusMsg;
        }
    }

    public UpnpResponse(int i10, String str) {
        this.f76842b = i10;
        this.f76843c = str;
    }

    public UpnpResponse(Status status) {
        this.f76842b = status.getStatusCode();
        this.f76843c = status.getStatusMsg();
    }

    public String c() {
        return d() + Z7.f30794r + e();
    }

    public int d() {
        return this.f76842b;
    }

    public String e() {
        return this.f76843c;
    }

    public boolean f() {
        return this.f76842b >= 300;
    }

    public String toString() {
        return c();
    }
}
