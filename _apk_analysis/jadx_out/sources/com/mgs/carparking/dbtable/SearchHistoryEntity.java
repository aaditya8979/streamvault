package com.mgs.carparking.dbtable;

import android.os.Parcel;
import android.os.Parcelable;
import bo.a0;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import up.b;
import up.f;

/* JADX INFO: compiled from: SearchHistoryEntity.kt */
/* JADX INFO: loaded from: classes10.dex */
@f(name = SearchHistoryEntity.TABLE_NAME)
public final class SearchHistoryEntity implements Parcelable {

    @NotNull
    public static final String CONTENT = "CONTENT";

    @NotNull
    public static final String CREATE_TIME = "create_time";

    @NotNull
    public static final String TABLE_NAME = "VIDEO_SEARCH_HISTORY";

    @b(name = "CONTENT")
    @Nullable
    private String content;

    @b(name = CREATE_TIME)
    private long createTime;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Parcelable.Creator<SearchHistoryEntity> CREATOR = new Parcelable.Creator<SearchHistoryEntity>() { // from class: com.mgs.carparking.dbtable.SearchHistoryEntity$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchHistoryEntity createFromParcel(Parcel parcel) {
            p.k(parcel, ScarConstants.IN_SIGNAL_KEY);
            return new SearchHistoryEntity(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchHistoryEntity[] newArray(int i10) {
            return new SearchHistoryEntity[i10];
        }
    };

    /* JADX INFO: compiled from: SearchHistoryEntity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Parcelable.Creator<SearchHistoryEntity> getCREATOR() {
            return SearchHistoryEntity.CREATOR;
        }
    }

    public SearchHistoryEntity() {
    }

    private SearchHistoryEntity(Parcel parcel) {
        this.content = parcel.readString();
        this.createTime = parcel.readLong();
    }

    public /* synthetic */ SearchHistoryEntity(Parcel parcel, i iVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getContent() {
        String str = this.content;
        p.h(str);
        if (a0.W(str, "http", false, 2, null)) {
            String str2 = this.content;
            p.h(str2);
            if (str2.length() > 15) {
                StringBuilder sb2 = new StringBuilder();
                String str3 = this.content;
                p.h(str3);
                String strSubstring = str3.substring(0, 15);
                p.j(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                sb2.append("...");
                return sb2.toString();
            }
        }
        return this.content;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setCreateTime(long j10) {
        this.createTime = j10;
    }

    @NotNull
    public String toString() {
        return "SearchHistoryEntity{content='" + this.content + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        p.k(parcel, "dest");
        parcel.writeString(this.content);
        parcel.writeLong(this.createTime);
    }
}
