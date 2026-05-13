package ee;

import android.graphics.Path;
import bo.a0;
import bo.d0;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.StringTokenizer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: SVGAPathEntity.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0013"}, d2 = {"Lee/b;", "", "Landroid/graphics/Path;", "toPath", "Lbn/r;", "a", "finalPath", "", "method", "Ljava/util/StringTokenizer;", "args", "b", "Ljava/lang/String;", "replacedValue", "Landroid/graphics/Path;", "cachedPath", "originValue", "<init>", "(Ljava/lang/String;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String replacedValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Path cachedPath;

    public b(@NotNull String str) {
        p.l(str, "originValue");
        this.replacedValue = d0.c0(str, StringUtils.COMMA, false, 2, null) ? a0.S(str, StringUtils.COMMA, Z7.f30794r, false, 4, null) : str;
    }

    public final void a(@NotNull Path path) {
        p.l(path, "toPath");
        Path path2 = this.cachedPath;
        if (path2 != null) {
            path.set(path2);
            return;
        }
        Path path3 = new Path();
        StringTokenizer stringTokenizer = new StringTokenizer(this.replacedValue, "MLHVCSQRAZmlhvcsqraz", true);
        String str = "";
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            p.g(strNextToken, "segment");
            if (!(strNextToken.length() == 0)) {
                if (c.f61107a.contains(strNextToken)) {
                    if (p.f(strNextToken, "Z") || p.f(strNextToken, "z")) {
                        b(path3, strNextToken, new StringTokenizer("", ""));
                    }
                    str = strNextToken;
                } else {
                    b(path3, str, new StringTokenizer(strNextToken, Z7.f30794r));
                }
            }
        }
        this.cachedPath = path3;
        path.set(path3);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Path r16, java.lang.String r17, java.util.StringTokenizer r18) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.b.b(android.graphics.Path, java.lang.String, java.util.StringTokenizer):void");
    }
}
