package b5;

import android.net.Uri;
import androidx.annotation.Nullable;
import b5.d;
import com.google.android.exoplayer.offline.StreamKey;
import com.google.android.exoplayer.upstream.g;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: FilteringManifestParser.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e<T extends d<T>> implements g.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a<? extends T> f5402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<StreamKey> f5403b;

    public e(g.a<? extends T> aVar, @Nullable List<StreamKey> list) {
        this.f5402a = aVar;
        this.f5403b = list;
    }

    @Override // com.google.android.exoplayer.upstream.g.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T t10 = this.f5402a.parse(uri, inputStream);
        List<StreamKey> list = this.f5403b;
        return (list == null || list.isEmpty()) ? t10 : (T) t10.copy(this.f5403b);
    }
}
