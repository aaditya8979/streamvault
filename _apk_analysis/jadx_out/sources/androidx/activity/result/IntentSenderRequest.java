package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: IntentSenderRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    @Nullable
    private final Intent fillInIntent;
    private final int flagsMask;
    private final int flagsValues;

    @NotNull
    private final IntentSender intentSender;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator<IntentSenderRequest>() { // from class: androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public IntentSenderRequest createFromParcel(@NotNull Parcel parcel) {
            p.k(parcel, "inParcel");
            return new IntentSenderRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    };

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    public static final class Builder {

        @Nullable
        private Intent fillInIntent;
        private int flagsMask;
        private int flagsValues;

        @NotNull
        private final IntentSender intentSender;

        /* JADX INFO: compiled from: IntentSenderRequest.kt */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Flag {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(@NotNull PendingIntent pendingIntent) {
            p.k(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
            IntentSender intentSender = pendingIntent.getIntentSender();
            p.j(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }

        public Builder(@NotNull IntentSender intentSender) {
            p.k(intentSender, "intentSender");
            this.intentSender = intentSender;
        }

        @NotNull
        public final IntentSenderRequest build() {
            return new IntentSenderRequest(this.intentSender, this.fillInIntent, this.flagsMask, this.flagsValues);
        }

        @NotNull
        public final Builder setFillInIntent(@Nullable Intent intent) {
            this.fillInIntent = intent;
            return this;
        }

        @NotNull
        public final Builder setFlags(int i10, int i11) {
            this.flagsValues = i10;
            this.flagsMask = i11;
            return this;
        }
    }

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    public IntentSenderRequest(@NotNull IntentSender intentSender, @Nullable Intent intent, int i10, int i11) {
        p.k(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i10;
        this.flagsValues = i11;
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11, int i12, i iVar) {
        this(intentSender, (i12 & 2) != 0 ? null : intent, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(@NotNull Parcel parcel) {
        p.k(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        p.h(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    public final int getFlagsMask() {
        return this.flagsMask;
    }

    public final int getFlagsValues() {
        return this.flagsValues;
    }

    @NotNull
    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        p.k(parcel, "dest");
        parcel.writeParcelable(this.intentSender, i10);
        parcel.writeParcelable(this.fillInIntent, i10);
        parcel.writeInt(this.flagsMask);
        parcel.writeInt(this.flagsValues);
    }
}
