package sg.bigo.ads.common.u.c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import sg.bigo.ads.common.utils.h;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements c<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f82443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final h<List<String>> f82444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f82445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Closeable f82446e;

    public a(int i10, int i11, @Nullable InputStream inputStream, @NonNull h<List<String>> hVar, @Nullable Closeable closeable) {
        this.f82445d = i10;
        this.f82442a = i11;
        this.f82443b = inputStream;
        this.f82444c = hVar;
        this.f82446e = closeable;
    }

    public final long a() {
        String strA = a("Content-Length");
        if (q.b((CharSequence) strA)) {
            try {
                return Long.parseLong(strA);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @Nullable
    public final String a(String str) {
        List<String> listA;
        if (!TextUtils.isEmpty(str) && (listA = this.f82444c.a(str)) != null && !listA.isEmpty()) {
            for (String str2 : listA) {
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        }
        return "";
    }
}
