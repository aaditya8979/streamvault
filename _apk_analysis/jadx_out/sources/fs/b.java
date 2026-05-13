package fs;

import es.a;
import es.e;
import java.util.Arrays;

/* JADX INFO: compiled from: VideoItem.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a.C0757a f61881k = new a.C0757a("object.item.videoItem");

    public b(String str, String str2, String str3, String str4, e... eVarArr) {
        super(str, str2, str3, str4, f61881k);
        if (eVarArr != null) {
            getResources().addAll(Arrays.asList(eVarArr));
        }
    }
}
