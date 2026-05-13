package gh;

import com.google.zxing.BarcodeFormat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: DecodeFormatManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f62404a = Pattern.compile(StringUtils.COMMA);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set<BarcodeFormat> f62411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map<String, Set<BarcodeFormat>> f62412i;

    static {
        EnumSet enumSetOf = EnumSet.of(BarcodeFormat.QR_CODE);
        f62408e = enumSetOf;
        EnumSet enumSetOf2 = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        f62409f = enumSetOf2;
        EnumSet enumSetOf3 = EnumSet.of(BarcodeFormat.AZTEC);
        f62410g = enumSetOf3;
        EnumSet enumSetOf4 = EnumSet.of(BarcodeFormat.PDF_417);
        f62411h = enumSetOf4;
        EnumSet enumSetOf5 = EnumSet.of(BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED);
        f62405b = enumSetOf5;
        EnumSet enumSetOf6 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        f62406c = enumSetOf6;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        f62407d = enumSetCopyOf;
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        f62412i = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }
}
