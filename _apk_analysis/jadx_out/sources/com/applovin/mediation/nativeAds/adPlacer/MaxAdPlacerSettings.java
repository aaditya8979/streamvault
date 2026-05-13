package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.o;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes9.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f11197c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11198d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11199e = 256;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11200f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f11195a = str;
    }

    public void addFixedPosition(int i10) {
        this.f11197c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f11195a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f11197c;
    }

    public int getMaxAdCount() {
        return this.f11199e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f11200f;
    }

    @Nullable
    public String getPlacement() {
        return this.f11196b;
    }

    public int getRepeatingInterval() {
        return this.f11198d;
    }

    public boolean hasValidPositioning() {
        return !this.f11197c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f11198d >= 2;
    }

    public void resetFixedPositions() {
        this.f11197c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f11199e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f11200f = i10;
    }

    public void setPlacement(@Nullable String str) {
        this.f11196b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f11198d = i10;
            o.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f11198d = 0;
        o.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f11195a + "', fixedPositions=" + this.f11197c + ", repeatingInterval=" + this.f11198d + ", maxAdCount=" + this.f11199e + ", maxPreloadedAdCount=" + this.f11200f + '}';
    }
}
