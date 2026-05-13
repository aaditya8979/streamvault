package la;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: PictureContextWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends ContextWrapper {
    public f(Context context) {
        super(context);
    }

    public static ContextWrapper a(Context context, int i10, int i11) {
        if (i10 != -2) {
            sa.b.d(context, i10, i11);
        }
        return new f(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return "audio".equals(str) ? getApplicationContext().getSystemService(str) : super.getSystemService(str);
    }
}
