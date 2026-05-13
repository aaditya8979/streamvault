package com.applovin.shadow.okio;

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

/* JADX INFO: compiled from: HashingSink.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HashingSink extends ForwardingSink {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final Mac mac;

    @Nullable
    private final MessageDigest messageDigest;

    /* JADX INFO: compiled from: HashingSink.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString byteString) {
            p.k(sink, "sink");
            p.k(byteString, "key");
            return new HashingSink(sink, byteString, "HmacSHA1");
        }

        @NotNull
        public final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString byteString) {
            p.k(sink, "sink");
            p.k(byteString, "key");
            return new HashingSink(sink, byteString, "HmacSHA256");
        }

        @NotNull
        public final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString byteString) {
            p.k(sink, "sink");
            p.k(byteString, "key");
            return new HashingSink(sink, byteString, "HmacSHA512");
        }

        @NotNull
        public final HashingSink md5(@NotNull Sink sink) {
            p.k(sink, "sink");
            return new HashingSink(sink, SameMD5.TAG);
        }

        @NotNull
        public final HashingSink sha1(@NotNull Sink sink) {
            p.k(sink, "sink");
            return new HashingSink(sink, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        @NotNull
        public final HashingSink sha256(@NotNull Sink sink) {
            p.k(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        @NotNull
        public final HashingSink sha512(@NotNull Sink sink) {
            p.k(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(@NotNull Sink sink, @NotNull ByteString byteString, @NotNull String str) throws NoSuchAlgorithmException {
        p.k(sink, "sink");
        p.k(byteString, "key");
        p.k(str, "algorithm");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            r rVar = r.f5635a;
            p.h(mac);
            this(sink, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(@NotNull Sink sink, @NotNull String str) throws NoSuchAlgorithmException {
        p.k(sink, "sink");
        p.k(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        p.j(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull MessageDigest messageDigest) {
        super(sink);
        p.k(sink, "sink");
        p.k(messageDigest, "digest");
        this.messageDigest = messageDigest;
        this.mac = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull Mac mac) {
        super(sink);
        p.k(sink, "sink");
        p.k(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    @NotNull
    public static final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    @NotNull
    public static final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    @NotNull
    public static final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    @NotNull
    public static final HashingSink md5(@NotNull Sink sink) {
        return Companion.md5(sink);
    }

    @NotNull
    public static final HashingSink sha1(@NotNull Sink sink) {
        return Companion.sha1(sink);
    }

    @NotNull
    public static final HashingSink sha256(@NotNull Sink sink) {
        return Companion.sha256(sink);
    }

    @NotNull
    public static final HashingSink sha512(@NotNull Sink sink) {
        return Companion.sha512(sink);
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m4277deprecated_hash() {
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

    @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink
    public void write(@NotNull Buffer buffer, long j10) throws IOException {
        p.k(buffer, "source");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j10);
        Segment segment = buffer.head;
        p.h(segment);
        long j11 = 0;
        while (j11 < j10) {
            int iMin = (int) Math.min(j10 - j11, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, iMin);
            } else {
                Mac mac = this.mac;
                p.h(mac);
                mac.update(segment.data, segment.pos, iMin);
            }
            j11 += (long) iMin;
            segment = segment.next;
            p.h(segment);
        }
        super.write(buffer, j10);
    }
}
