package qq;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import sq.j;

/* JADX INFO: compiled from: HashedSession.java */
/* JADX INFO: loaded from: classes8.dex */
public class f extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final vq.c f78411s = vq.b.a(f.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f78412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient boolean f78413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient boolean f78414r;

    public f(e eVar, long j10, long j11, String str) {
        super(eVar, j10, j11, str);
        this.f78413q = false;
        this.f78414r = false;
        this.f78412p = eVar;
    }

    public f(e eVar, an.a aVar) {
        super(eVar, aVar);
        this.f78413q = false;
        this.f78414r = false;
        this.f78412p = eVar;
    }

    public synchronized void C() {
        FileInputStream fileInputStream;
        Exception e10;
        if (E()) {
            c(System.currentTimeMillis());
            vq.c cVar = f78411s;
            if (cVar.isDebugEnabled()) {
                cVar.h("De-idling " + super.getId(), new Object[0]);
            }
            try {
                File file = new File(this.f78412p.V, super.getId());
                if (!file.exists() || !file.canRead()) {
                    throw new FileNotFoundException(file.getName());
                }
                fileInputStream = new FileInputStream(file);
                try {
                    this.f78413q = false;
                    this.f78412p.F0(fileInputStream, this);
                    j.a(fileInputStream);
                    i();
                    if (this.f78412p.S == 0) {
                        file.delete();
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    f78411s.d("Problem de-idling session " + super.getId(), e10);
                    if (fileInputStream != null) {
                        j.a(fileInputStream);
                    }
                    invalidate();
                }
            } catch (Exception e12) {
                fileInputStream = null;
                e10 = e12;
            }
        }
    }

    public synchronized void D() throws Exception {
        G(false);
        this.f78413q = true;
    }

    public synchronized boolean E() {
        return this.f78413q;
    }

    public synchronized void F(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(o());
        dataOutputStream.writeUTF(s());
        dataOutputStream.writeLong(q());
        dataOutputStream.writeLong(m());
        dataOutputStream.writeInt(t());
        dataOutputStream.writeInt(n());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(dataOutputStream);
        Enumeration<String> enumerationB = b();
        while (enumerationB.hasMoreElements()) {
            String strNextElement = enumerationB.nextElement();
            objectOutputStream.writeUTF(strNextElement);
            objectOutputStream.writeObject(j(strNextElement));
        }
        objectOutputStream.close();
    }

    public synchronized void G(boolean z10) throws Exception {
        File file;
        FileOutputStream fileOutputStream;
        if (!E() && !this.f78414r) {
            vq.c cVar = f78411s;
            if (cVar.isDebugEnabled()) {
                cVar.h("Saving {} {}", super.getId(), Boolean.valueOf(z10));
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                file = new File(this.f78412p.V, super.getId());
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                file = null;
            }
            try {
                B();
                F(fileOutputStream);
                j.b(fileOutputStream);
                if (z10) {
                    i();
                } else {
                    f();
                }
            } catch (Exception e12) {
                e = e12;
                fileOutputStream2 = fileOutputStream;
                H();
                if (fileOutputStream2 != null) {
                    j.b(fileOutputStream2);
                }
                if (file != null) {
                    file.delete();
                }
                throw e;
            }
        }
    }

    public synchronized void H() {
        this.f78414r = true;
    }

    @Override // qq.a
    public void e() {
        if (this.f78412p.T != 0) {
            C();
        }
        super.e();
    }

    @Override // qq.a
    public void k() throws IllegalStateException {
        super.k();
        if (this.f78412p.V == null || getId() == null) {
            return;
        }
        new File(this.f78412p.V, getId()).delete();
    }

    @Override // qq.a
    public void x(int i10) {
        super.x(i10);
        if (r() > 0) {
            long jR = (((long) r()) * 1000) / 10;
            e eVar = this.f78412p;
            if (jR < eVar.R) {
                eVar.L0((i10 + 9) / 10);
            }
        }
    }
}
