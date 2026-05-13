package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class rb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx0 f94346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f94350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f94351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f94352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f94353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bl[] f94354i;

    public rb0(mx0 mx0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, bl[] blVarArr) {
        this.f94346a = mx0Var;
        this.f94347b = i10;
        this.f94348c = i11;
        this.f94349d = i12;
        this.f94350e = i13;
        this.f94351f = i14;
        this.f94352g = i15;
        this.f94353h = i16;
        this.f94354i = blVarArr;
    }

    public final AudioTrack a(boolean z10, pk pkVar, int i10) throws fl {
        try {
            AudioTrack audioTrackB = b(z10, pkVar, i10);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new fl(state, this.f94350e, this.f94351f, this.f94353h, this.f94346a, this.f94348c == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new fl(0, this.f94350e, this.f94351f, this.f94353h, this.f94346a, this.f94348c == 1, e10);
        }
    }

    public final AudioTrack b(boolean z10, pk pkVar, int i10) {
        AudioAttributes audioAttributesBuild;
        AudioAttributes audioAttributesBuild2;
        int i11 = ib3.f90737a;
        if (i11 >= 29) {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(this.f94350e).setChannelMask(this.f94351f).setEncoding(this.f94352g).build();
            if (z10) {
                audioAttributesBuild2 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                if (pkVar.f93618g == null) {
                    pkVar.f93618g = new ok(pkVar);
                }
                audioAttributesBuild2 = pkVar.f93618g.f93242a;
            }
            return new AudioTrack.Builder().setAudioAttributes(audioAttributesBuild2).setAudioFormat(audioFormatBuild).setTransferMode(1).setBufferSizeInBytes(this.f94353h).setSessionId(i10).setOffloadedPlayback(this.f94348c == 1).build();
        }
        if (i11 < 21) {
            int iC = ib3.c(pkVar.f93615d);
            return i10 == 0 ? new AudioTrack(iC, this.f94350e, this.f94351f, this.f94352g, this.f94353h, 1) : new AudioTrack(iC, this.f94350e, this.f94351f, this.f94352g, this.f94353h, 1, i10);
        }
        if (z10) {
            audioAttributesBuild = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            if (pkVar.f93618g == null) {
                pkVar.f93618g = new ok(pkVar);
            }
            audioAttributesBuild = pkVar.f93618g.f93242a;
        }
        return new AudioTrack(audioAttributesBuild, new AudioFormat.Builder().setSampleRate(this.f94350e).setChannelMask(this.f94351f).setEncoding(this.f94352g).build(), this.f94353h, 1, i10);
    }
}
