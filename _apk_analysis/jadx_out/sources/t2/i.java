package t2;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import k2.t;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001e\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lt2/i;", "", "Ljava/io/File;", "a", C3978d4.i.f31327b, "", "", "Lt2/a;", "c", "texts", "", "maxLen", "", "d", "str", "b", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f84617a = new i();

    @Nullable
    public static final File a() {
        if (c3.a.d(i.class)) {
            return null;
        }
        try {
            File file = new File(t.l().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            c3.a.b(th2, i.class);
            return null;
        }
    }

    @Nullable
    public static final Map<String, a> c(@NotNull File file) {
        Map<String, a> map;
        Map<String, a> map2 = null;
        if (c3.a.d(i.class)) {
            return null;
        }
        try {
            p.k(file, C3978d4.i.f31327b);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable < 4) {
                    return null;
                }
                int i10 = 0;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i11 = byteBufferWrap.getInt();
                int i12 = i11 + 4;
                if (iAvailable < i12) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i11, bo.c.f5639b));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                int i13 = length - 1;
                if (i13 >= 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        strArr[i14] = jSONArrayNames.getString(i14);
                        if (i15 > i13) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                cn.p.F(strArr);
                HashMap map3 = new HashMap();
                int i16 = 0;
                while (i16 < length) {
                    String str = strArr[i16];
                    i16++;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i17 = length2 - 1;
                        int i18 = 1;
                        if (i17 >= 0) {
                            while (true) {
                                int i19 = i10 + 1;
                                try {
                                    int i20 = jSONArray.getInt(i10);
                                    iArr[i10] = i20;
                                    i18 *= i20;
                                    if (i19 > i17) {
                                        break;
                                    }
                                    i10 = i19;
                                } catch (Exception unused) {
                                    return null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    map = null;
                                    c3.a.b(th, i.class);
                                    return map;
                                }
                            }
                        }
                        int i21 = i18 * 4;
                        int i22 = i12 + i21;
                        if (i22 > iAvailable) {
                            return null;
                        }
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i12, i21);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        a aVar = new a(iArr);
                        byteBufferWrap2.asFloatBuffer().get(aVar.getData(), 0, i18);
                        map3.put(str, aVar);
                        i12 = i22;
                        i10 = 0;
                        map2 = null;
                    }
                }
                return map3;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th3) {
            th = th3;
            map = map2;
        }
    }

    @NotNull
    public final String b(@NotNull String str) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            p.k(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = p.m(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            Object[] array = new Regex("\\s+").split(str.subSequence(i10, length + 1).toString(), 0).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String strJoin = TextUtils.join(Z7.f30794r, (String[]) array);
            p.j(strJoin, "join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }

    @NotNull
    public final int[] d(@NotNull String texts, int maxLen) {
        if (c3.a.d(this)) {
            return null;
        }
        try {
            p.k(texts, "texts");
            int[] iArr = new int[maxLen];
            String strB = b(texts);
            Charset charsetForName = Charset.forName("UTF-8");
            p.j(charsetForName, "forName(\"UTF-8\")");
            if (strB == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = strB.getBytes(charsetForName);
            p.j(bytes, "(this as java.lang.String).getBytes(charset)");
            if (maxLen > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 < bytes.length) {
                        iArr[i10] = bytes[i10] & 255;
                    } else {
                        iArr[i10] = 0;
                    }
                    if (i11 >= maxLen) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return iArr;
        } catch (Throwable th2) {
            c3.a.b(th2, this);
            return null;
        }
    }
}
