package af;

import android.app.Activity;
import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.List;

/* JADX INFO: compiled from: IScarAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public interface e {
    void a(Context context, String str, UnityAdFormat unityAdFormat, df.b bVar);

    void b(Context context, boolean z10, df.b bVar);

    void c(Context context, List<UnityAdFormat> list, df.b bVar);

    void d(Activity activity, String str, String str2);

    void e(Context context, cf.c cVar, g gVar);

    void f(Context context, cf.c cVar, h hVar);

    void g(Context context, RelativeLayout relativeLayout, cf.c cVar, int i10, int i11, f fVar);
}
