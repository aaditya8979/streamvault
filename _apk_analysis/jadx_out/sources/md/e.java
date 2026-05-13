package md;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ld.a;

/* JADX INFO: compiled from: ObjectLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class e<D> extends a<Object> {
    public e(String str, Context context) {
        super(str, context);
    }

    @Override // md.a, md.d
    public <D> List<D> a(String str, Class<D> cls) {
        ld.d.e(str, "key can't be null");
        try {
            a.e eVarA = this.f74113c.A(d(str));
            if (eVarA != null) {
                return ld.b.a(eVarA.a(0), cls);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return new ArrayList();
    }

    @Override // md.a, md.d
    public boolean b(String str, Object obj) {
        ld.d.e(str, "key can't be null");
        try {
            a.c cVarW = this.f74113c.w(d(str));
            if (ld.b.b(cVarW.f(0), obj)) {
                cVarW.e();
            } else {
                cVarW.a();
            }
            this.f74113c.flush();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
