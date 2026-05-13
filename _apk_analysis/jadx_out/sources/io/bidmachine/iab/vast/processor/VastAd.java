package io.bidmachine.iab.vast.processor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.tags.AdVerificationsExtensionTag;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.CompanionTag;
import io.bidmachine.iab.vast.tags.LinearCreativeTag;
import io.bidmachine.iab.vast.tags.MediaFileTag;
import io.bidmachine.iab.vast.tags.VideoClicksTag;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class VastAd implements Parcelable {
    public static final Parcelable.Creator<VastAd> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearCreativeTag f69630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaFileTag f69631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VastRequest f69632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f69633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f69634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f69635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f69636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f69637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumMap f69638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AppodealExtensionTag f69639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f69640k = new ArrayList();

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VastAd createFromParcel(Parcel parcel) {
            return new VastAd(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VastAd[] newArray(int i10) {
            return new VastAd[i10];
        }
    }

    public VastAd(Parcel parcel) {
        this.f69630a = (LinearCreativeTag) parcel.readSerializable();
        this.f69631b = (MediaFileTag) parcel.readSerializable();
        this.f69633d = (ArrayList) parcel.readSerializable();
        this.f69634e = parcel.createStringArrayList();
        this.f69635f = parcel.createStringArrayList();
        this.f69636g = parcel.createStringArrayList();
        this.f69637h = parcel.createStringArrayList();
        this.f69638i = (EnumMap) parcel.readSerializable();
        this.f69639j = (AppodealExtensionTag) parcel.readSerializable();
        parcel.readList(this.f69640k, AdVerificationsExtensionTag.class.getClassLoader());
    }

    public VastAd(LinearCreativeTag linearCreativeTag, MediaFileTag mediaFileTag) {
        this.f69630a = linearCreativeTag;
        this.f69631b = mediaFileTag;
    }

    public void a(VastSpecError vastSpecError) {
        VastRequest vastRequest = this.f69632c;
        if (vastRequest != null) {
            vastRequest.sendVastSpecError(vastSpecError);
        }
    }

    public void a(AppodealExtensionTag appodealExtensionTag) {
        this.f69639j = appodealExtensionTag;
    }

    public void a(ArrayList arrayList) {
        this.f69636g = arrayList;
    }

    public void a(EnumMap enumMap) {
        this.f69638i = enumMap;
    }

    public void b(ArrayList arrayList) {
        this.f69633d = arrayList;
    }

    public void c(ArrayList arrayList) {
        this.f69635f = arrayList;
    }

    public void d(ArrayList arrayList) {
        this.f69634e = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String getAdParameters() {
        return this.f69630a.getAdParameters();
    }

    @NonNull
    public List<AdVerificationsExtensionTag> getAdVerificationsExtensionList() {
        return this.f69640k;
    }

    @Nullable
    public AppodealExtensionTag getAppodealExtension() {
        return this.f69639j;
    }

    @Nullable
    public CompanionTag getBanner(@NonNull Context context) {
        ArrayList arrayList = this.f69633d;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (CompanionTag companionTag : this.f69633d) {
                int width = companionTag.getWidth();
                int height = companionTag.getHeight();
                if (width > -1 && height > -1) {
                    if (Utils.isTablet(context) && width == 728 && height == 90) {
                        return companionTag;
                    }
                    if (!Utils.isTablet(context) && width == 320 && height == 50) {
                        return companionTag;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public String getClickThroughUrl() {
        VideoClicksTag videoClicksTag = this.f69630a.getVideoClicksTag();
        if (videoClicksTag != null) {
            return videoClicksTag.getClickThroughUrl();
        }
        return null;
    }

    @Nullable
    public List<String> getClickTrackingUrlList() {
        return this.f69636g;
    }

    @Nullable
    public CompanionTag getCompanion(int i10, int i11) {
        ArrayList arrayList = this.f69633d;
        if (arrayList != null && !arrayList.isEmpty()) {
            HashMap map = new HashMap();
            for (CompanionTag companionTag : this.f69633d) {
                int width = companionTag.getWidth();
                int height = companionTag.getHeight();
                if (width > -1 && height > -1) {
                    float fMax = Math.max(width, height) / Math.min(width, height);
                    if (Math.min(width, height) >= 250 && fMax <= 2.5d && companionTag.hasCreative()) {
                        map.put(Float.valueOf(width / height), companionTag);
                    }
                }
            }
            if (!map.isEmpty()) {
                float f10 = i10 / i11;
                Set setKeySet = map.keySet();
                float fFloatValue = ((Float) setKeySet.iterator().next()).floatValue();
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    float fFloatValue2 = ((Float) it.next()).floatValue();
                    if (Math.abs(fFloatValue - f10) > Math.abs(fFloatValue2 - f10)) {
                        fFloatValue = fFloatValue2;
                    }
                }
                return (CompanionTag) map.get(Float.valueOf(fFloatValue));
            }
            a(VastSpecError.GENERAL_COMPANION);
        }
        return null;
    }

    @Nullable
    public Float getDurationSec() {
        return this.f69630a.getDurationSec();
    }

    @Nullable
    public List<String> getErrorUrlList() {
        return this.f69635f;
    }

    @Nullable
    public List<String> getImpressionUrlList() {
        return this.f69634e;
    }

    @NonNull
    public MediaFileTag getPickedMediaFileTag() {
        return this.f69631b;
    }

    public int getSkipOffsetSec() {
        return this.f69630a.getSkipOffsetSec();
    }

    @Nullable
    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.f69638i;
    }

    @Nullable
    public ArrayList<String> getWrapperCompanionClickTrackingUrlList() {
        return this.f69637h;
    }

    public void setAdVerificationsExtensionList(@NonNull List<AdVerificationsExtensionTag> list) {
        this.f69640k = list;
    }

    public void setVastRequest(@Nullable VastRequest vastRequest) {
        this.f69632c = vastRequest;
    }

    public void setWrapperCompanionClickTrackingUrlList(@Nullable ArrayList<String> arrayList) {
        this.f69637h = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f69630a);
        parcel.writeSerializable(this.f69631b);
        parcel.writeSerializable(this.f69633d);
        parcel.writeStringList(this.f69634e);
        parcel.writeStringList(this.f69635f);
        parcel.writeStringList(this.f69636g);
        parcel.writeStringList(this.f69637h);
        parcel.writeSerializable(this.f69638i);
        parcel.writeSerializable(this.f69639j);
        parcel.writeList(this.f69640k);
    }
}
