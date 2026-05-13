package y4;

import a6.k0;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w4.c;

/* JADX INFO: compiled from: IcyDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements w4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f87251c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f87252a = Charset.forName("UTF-8").newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f87253b = Charset.forName("ISO-8859-1").newDecoder();

    @Override // w4.a
    public Metadata a(c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a6.a.e(cVar.f63711c);
        String strB = b(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strB == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f87251c.matcher(strB);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strK0 = k0.K0(matcher.group(1));
            String strGroup = matcher.group(2);
            strK0.hashCode();
            if (strK0.equals("streamurl")) {
                str2 = strGroup;
            } else if (strK0.equals("streamtitle")) {
                str = strGroup;
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }

    @Nullable
    public final String b(ByteBuffer byteBuffer) {
        try {
            return this.f87252a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f87253b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f87253b.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f87252a.reset();
            byteBuffer.rewind();
        }
    }
}
