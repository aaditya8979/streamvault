package okio;

import bn.r;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: HashingSource.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HashingSource extends ForwardingSource {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final Mac mac;

    @Nullable
    private final MessageDigest messageDigest;

    /* JADX INFO: compiled from: HashingSource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString byteString) {
            p.k(source, "source");
            p.k(byteString, "key");
            return new HashingSource(source, byteString, "HmacSHA1");
        }

        @NotNull
        public final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString byteString) {
            p.k(source, "source");
            p.k(byteString, "key");
            return new HashingSource(source, byteString, "HmacSHA256");
        }

        @NotNull
        public final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString byteString) {
            p.k(source, "source");
            p.k(byteString, "key");
            return new HashingSource(source, byteString, "HmacSHA512");
        }

        @NotNull
        public final HashingSource md5(@NotNull Source source) {
            p.k(source, "source");
            return new HashingSource(source, SameMD5.TAG);
        }

        @NotNull
        public final HashingSource sha1(@NotNull Source source) {
            p.k(source, "source");
            return new HashingSource(source, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        @NotNull
        public final HashingSource sha256(@NotNull Source source) {
            p.k(source, "source");
            return new HashingSource(source, "SHA-256");
        }

        @NotNull
        public final HashingSource sha512(@NotNull Source source) {
            p.k(source, "source");
            return new HashingSource(source, "SHA-512");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(@NotNull Source source, @NotNull String str) throws NoSuchAlgorithmException {
        p.k(source, "source");
        p.k(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        p.j(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@NotNull Source source, @NotNull MessageDigest messageDigest) {
        super(source);
        p.k(source, "source");
        p.k(messageDigest, "digest");
        this.messageDigest = messageDigest;
        this.mac = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@NotNull Source source, @NotNull Mac mac) {
        super(source);
        p.k(source, "source");
        p.k(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(@NotNull Source source, @NotNull ByteString byteString, @NotNull String str) throws NoSuchAlgorithmException {
        p.k(source, "source");
        p.k(byteString, "key");
        p.k(str, "algorithm");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            r rVar = r.f5635a;
            p.h(mac);
            this(source, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NotNull
    public static final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    @NotNull
    public static final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    @NotNull
    public static final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    @NotNull
    public static final HashingSource md5(@NotNull Source source) {
        return Companion.md5(source);
    }

    @NotNull
    public static final HashingSource sha1(@NotNull Source source) {
        return Companion.sha1(source);
    }

    @NotNull
    public static final HashingSource sha256(@NotNull Source source) {
        return Companion.sha256(source);
    }

    @NotNull
    public static final HashingSource sha512(@NotNull Source source) {
        return Companion.sha512(source);
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m7700deprecated_hash() {
        return hash();
    }

    @NotNull
    public final ByteString hash() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            p.h(mac);
            bArrDoFinal = mac.doFinal();
        }
        p.h(bArrDoFinal);
        return new ByteString(bArrDoFinal);
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer buffer, long j10) throws IOException {
        p.k(buffer, "sink");
        long j11 = super.read(buffer, j10);
        if (j11 != -1) {
            long size = buffer.size() - j11;
            long size2 = buffer.size();
            Segment segment = buffer.head;
            p.h(segment);
            while (size2 > size) {
                segment = segment.prev;
                p.h(segment);
                size2 -= (long) (segment.limit - segment.pos);
            }
            while (size2 < buffer.size()) {
                int i10 = (int) ((((long) segment.pos) + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i10, segment.limit - i10);
                } else {
                    Mac mac = this.mac;
                    p.h(mac);
                    mac.update(segment.data, i10, segment.limit - i10);
                }
                size2 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                p.h(segment);
                size = size2;
            }
        }
        return j11;
    }
}
