package y6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v6.e;
import y7.c;

/* JADX INFO: compiled from: IcyDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f87329c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f87330a = c.f87337c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f87331b = c.f87336b.newDecoder();

    @Override // v6.e
    public Metadata b(v6.c cVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f87329c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = y7.a.e(strGroup);
                strE.hashCode();
                if (strE.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strE.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }

    @Nullable
    public final String c(ByteBuffer byteBuffer) {
        try {
            return this.f87330a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f87331b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f87331b.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f87330a.reset();
            byteBuffer.rewind();
        }
    }
}
