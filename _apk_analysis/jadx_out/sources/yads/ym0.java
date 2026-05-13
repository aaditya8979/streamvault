package yads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class ym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f97229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f97230b;

    public ym0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f97229a = byteArrayOutputStream;
        this.f97230b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(wm0 wm0Var) {
        this.f97229a.reset();
        try {
            DataOutputStream dataOutputStream = this.f97230b;
            dataOutputStream.writeBytes(wm0Var.f96446b);
            dataOutputStream.writeByte(0);
            String str = wm0Var.f96447c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f97230b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f97230b.writeLong(wm0Var.f96448d);
            this.f97230b.writeLong(wm0Var.f96449e);
            this.f97230b.write(wm0Var.f96450f);
            this.f97230b.flush();
            return this.f97229a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
