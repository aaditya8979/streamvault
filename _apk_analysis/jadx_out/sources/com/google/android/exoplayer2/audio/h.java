package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.b;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.c;
import com.google.android.exoplayer2.y;
import com.google.common.collect.ImmutableList;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import d6.u1;
import d6.z0;
import f6.r;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import s7.m0;
import s7.q;
import s7.s;
import s7.t;
import s7.u;

/* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public class h extends MediaCodecRenderer implements s {
    public final Context H0;
    public final b.a I0;
    public final AudioSink J0;
    public int K0;
    public boolean L0;

    @Nullable
    public m M0;
    public long N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;

    @Nullable
    public y.a S0;

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    @RequiresApi(23)
    public static final class b {
        @DoNotInline
        public static void a(AudioSink audioSink, @Nullable Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    public final class c implements AudioSink.a {
        public c() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onAudioSinkError(Exception exc) {
            q.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            h.this.I0.l(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onOffloadBufferEmptying() {
            if (h.this.S0 != null) {
                h.this.S0.onWakeup();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onOffloadBufferFull() {
            if (h.this.S0 != null) {
                h.this.S0.onSleep();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onPositionAdvancing(long j10) {
            h.this.I0.B(j10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onPositionDiscontinuity() {
            h.this.f1();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onSkipSilenceEnabledChanged(boolean z10) {
            h.this.I0.C(z10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onUnderrun(int i10, long j10, long j11) {
            h.this.I0.D(i10, j10, j11);
        }
    }

    public h(Context context, c.b bVar, com.google.android.exoplayer2.mediacodec.e eVar, boolean z10, @Nullable Handler handler, @Nullable com.google.android.exoplayer2.audio.b bVar2, AudioSink audioSink) {
        super(1, bVar, eVar, z10, 44100.0f);
        this.H0 = context.getApplicationContext();
        this.J0 = audioSink;
        this.I0 = new b.a(handler, bVar2);
        audioSink.f(new c());
    }

    public static boolean Z0(String str) {
        if (m0.f79487a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(m0.f79489c)) {
            String str2 = m0.f79488b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean a1() {
        if (m0.f79487a == 23) {
            String str = m0.f79490d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static List<com.google.android.exoplayer2.mediacodec.d> d1(com.google.android.exoplayer2.mediacodec.e eVar, m mVar, boolean z10, AudioSink audioSink) throws MediaCodecUtil.DecoderQueryException {
        com.google.android.exoplayer2.mediacodec.d dVarV;
        String str = mVar.f21751m;
        if (str == null) {
            return ImmutableList.of();
        }
        if (audioSink.a(mVar) && (dVarV = MediaCodecUtil.v()) != null) {
            return ImmutableList.of(dVarV);
        }
        List<com.google.android.exoplayer2.mediacodec.d> decoderInfos = eVar.getDecoderInfos(str, z10, false);
        String strM = MediaCodecUtil.m(mVar);
        return strM == null ? ImmutableList.copyOf((Collection) decoderInfos) : ImmutableList.builder().k(decoderInfos).k(eVar.getDecoderInfos(strM, z10, false)).m();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void E0() throws ExoPlaybackException {
        try {
            this.J0.playToEndOfStream();
        } catch (AudioSink.WriteException e10) {
            throw g(e10, e10.format, e10.isRecoverable, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean R0(m mVar) {
        return this.J0.a(mVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int S0(com.google.android.exoplayer2.mediacodec.e eVar, m mVar) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        if (!u.l(mVar.f21751m)) {
            return u1.create(0);
        }
        int i10 = m0.f79487a >= 21 ? 32 : 0;
        boolean z11 = true;
        boolean z12 = mVar.F != 0;
        boolean zT0 = MediaCodecRenderer.T0(mVar);
        int i11 = 8;
        if (zT0 && this.J0.a(mVar) && (!z12 || MediaCodecUtil.v() != null)) {
            return u1.create(4, 8, i10);
        }
        if ((!"audio/raw".equals(mVar.f21751m) || this.J0.a(mVar)) && this.J0.a(m0.X(2, mVar.f21764z, mVar.A))) {
            List<com.google.android.exoplayer2.mediacodec.d> listD1 = d1(eVar, mVar, false, this.J0);
            if (listD1.isEmpty()) {
                return u1.create(1);
            }
            if (!zT0) {
                return u1.create(2);
            }
            com.google.android.exoplayer2.mediacodec.d dVar = listD1.get(0);
            boolean zM = dVar.m(mVar);
            if (zM) {
                z10 = true;
                z11 = zM;
            } else {
                for (int i12 = 1; i12 < listD1.size(); i12++) {
                    com.google.android.exoplayer2.mediacodec.d dVar2 = listD1.get(i12);
                    if (dVar2.m(mVar)) {
                        z10 = false;
                        dVar = dVar2;
                        break;
                    }
                }
                z10 = true;
                z11 = zM;
            }
            int i13 = z11 ? 4 : 3;
            if (z11 && dVar.p(mVar)) {
                i11 = 16;
            }
            return u1.create(i13, i11, i10, dVar.f21861h ? 64 : 0, z10 ? 128 : 0);
        }
        return u1.create(1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float Y(float f10, m mVar, m[] mVarArr) {
        int iMax = -1;
        for (m mVar2 : mVarArr) {
            int i10 = mVar2.A;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<com.google.android.exoplayer2.mediacodec.d> a0(com.google.android.exoplayer2.mediacodec.e eVar, m mVar, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.u(d1(eVar, mVar, z10, this.J0), mVar);
    }

    @Override // s7.s
    public void b(com.google.android.exoplayer2.u uVar) {
        this.J0.b(uVar);
    }

    public final int b1(com.google.android.exoplayer2.mediacodec.d dVar, m mVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(dVar.f21854a) || (i10 = m0.f79487a) >= 24 || (i10 == 23 && m0.r0(this.H0))) {
            return mVar.f21752n;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public c.a c0(com.google.android.exoplayer2.mediacodec.d dVar, m mVar, @Nullable MediaCrypto mediaCrypto, float f10) {
        this.K0 = c1(dVar, mVar, l());
        this.L0 = Z0(dVar.f21854a);
        MediaFormat mediaFormatE1 = e1(mVar, dVar.f21856c, this.K0, f10);
        this.M0 = "audio/raw".equals(dVar.f21855b) && !"audio/raw".equals(mVar.f21751m) ? mVar : null;
        return c.a.a(dVar, mediaFormatE1, mVar, mediaCrypto);
    }

    public int c1(com.google.android.exoplayer2.mediacodec.d dVar, m mVar, m[] mVarArr) {
        int iB1 = b1(dVar, mVar);
        if (mVarArr.length == 1) {
            return iB1;
        }
        for (m mVar2 : mVarArr) {
            if (dVar.e(mVar, mVar2).f62113d != 0) {
                iB1 = Math.max(iB1, b1(dVar, mVar2));
            }
        }
        return iB1;
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat e1(m mVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", mVar.f21764z);
        mediaFormat.setInteger("sample-rate", mVar.A);
        t.e(mediaFormat, mVar.f21753o);
        t.d(mediaFormat, "max-input-size", i10);
        int i11 = m0.f79487a;
        if (i11 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f && !a1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(mVar.f21751m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.J0.g(m0.X(4, mVar.f21764z, mVar.A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    @CallSuper
    public void f1() {
        this.P0 = true;
    }

    public final void g1() {
        long currentPositionUs = this.J0.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.P0) {
                currentPositionUs = Math.max(this.N0, currentPositionUs);
            }
            this.N0 = currentPositionUs;
            this.P0 = false;
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.y
    @Nullable
    public s getMediaClock() {
        return this;
    }

    @Override // com.google.android.exoplayer2.y, d6.u1
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // s7.s
    public com.google.android.exoplayer2.u getPlaybackParameters() {
        return this.J0.getPlaybackParameters();
    }

    @Override // s7.s
    public long getPositionUs() {
        if (getState() == 2) {
            g1();
        }
        return this.N0;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.w.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
        if (i10 == 2) {
            this.J0.setVolume(((Float) obj).floatValue());
        }
        if (i10 == 3) {
            this.J0.c((com.google.android.exoplayer2.audio.a) obj);
            return;
        }
        if (i10 == 6) {
            this.J0.e((r) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.J0.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.J0.setAudioSessionId(((Integer) obj).intValue());
                break;
            case 11:
                this.S0 = (y.a) obj;
                break;
            case 12:
                if (m0.f79487a >= 23) {
                    b.a(this.J0, obj);
                }
                break;
            default:
                super.handleMessage(i10, obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.y
    public boolean isEnded() {
        return super.isEnded() && this.J0.isEnded();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.y
    public boolean isReady() {
        return this.J0.hasPendingData() || super.isReady();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void n() {
        this.Q0 = true;
        try {
            this.J0.flush();
            try {
                super.n();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.n();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void o(boolean z10, boolean z11) throws ExoPlaybackException {
        super.o(z10, z11);
        this.I0.p(this.C0);
        if (h().f59707a) {
            this.J0.enableTunnelingV21();
        } else {
            this.J0.disableTunneling();
        }
        this.J0.i(k());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        super.p(j10, z10);
        if (this.R0) {
            this.J0.d();
        } else {
            this.J0.flush();
        }
        this.N0 = j10;
        this.O0 = true;
        this.P0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void p0(Exception exc) {
        q.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.I0.k(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void q() {
        try {
            super.q();
        } finally {
            if (this.Q0) {
                this.Q0 = false;
                this.J0.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void q0(String str, c.a aVar, long j10, long j11) {
        this.I0.m(str, j10, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void r() {
        super.r();
        this.J0.play();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void r0(String str) {
        this.I0.n(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void s() {
        g1();
        this.J0.pause();
        super.s();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    public g6.g s0(z0 z0Var) throws ExoPlaybackException {
        g6.g gVarS0 = super.s0(z0Var);
        this.I0.q(z0Var.f59724b, gVarS0);
        return gVarS0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void t0(m mVar, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
        int i10;
        m mVar2 = this.M0;
        int[] iArr = null;
        if (mVar2 != null) {
            mVar = mVar2;
        } else if (V() != null) {
            m mVarE = new m.b().e0("audio/raw").Y("audio/raw".equals(mVar.f21751m) ? mVar.B : (m0.f79487a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? m0.W(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).N(mVar.C).O(mVar.D).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.L0 && mVarE.f21764z == 6 && (i10 = mVar.f21764z) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < mVar.f21764z; i11++) {
                    iArr[i11] = i11;
                }
            }
            mVar = mVarE;
        }
        try {
            this.J0.h(mVar, 0, iArr);
        } catch (AudioSink.ConfigurationException e10) {
            throw f(e10, e10.format, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void u0(long j10) {
        this.J0.setOutputStreamOffsetUs(j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void w0() {
        super.w0();
        this.J0.handleDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void x0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.O0 || decoderInputBuffer.f()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f21432f - this.N0) > 500000) {
            this.N0 = decoderInputBuffer.f21432f;
        }
        this.O0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public g6.g z(com.google.android.exoplayer2.mediacodec.d dVar, m mVar, m mVar2) {
        g6.g gVarE = dVar.e(mVar, mVar2);
        int i10 = gVarE.f62114e;
        if (b1(dVar, mVar2) > this.K0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new g6.g(dVar.f21854a, mVar, mVar2, i11 != 0 ? 0 : gVarE.f62113d, i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean z0(long j10, long j11, @Nullable com.google.android.exoplayer2.mediacodec.c cVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, m mVar) throws ExoPlaybackException {
        s7.a.e(byteBuffer);
        if (this.M0 != null && (i11 & 2) != 0) {
            ((com.google.android.exoplayer2.mediacodec.c) s7.a.e(cVar)).releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            if (cVar != null) {
                cVar.releaseOutputBuffer(i10, false);
            }
            this.C0.f62101f += i12;
            this.J0.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.J0.handleBuffer(byteBuffer, j12, i12)) {
                return false;
            }
            if (cVar != null) {
                cVar.releaseOutputBuffer(i10, false);
            }
            this.C0.f62100e += i12;
            return true;
        } catch (AudioSink.InitializationException e10) {
            throw g(e10, e10.format, e10.isRecoverable, 5001);
        } catch (AudioSink.WriteException e11) {
            throw g(e11, mVar, e11.isRecoverable, 5002);
        }
    }
}
