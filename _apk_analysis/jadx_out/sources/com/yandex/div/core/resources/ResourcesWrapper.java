package com.yandex.div.core.resources;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ResourcesWrapper.kt */
/* JADX INFO: loaded from: classes4.dex */
public class ResourcesWrapper extends Resources {

    @NotNull
    private final Resources resources;

    public ResourcesWrapper(@NotNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.resources = resources;
    }

    @Override // android.content.res.Resources
    @RequiresApi(30)
    public void addLoaders(@NotNull ResourcesLoader... resourcesLoaderArr) {
        this.resources.addLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getAnimation(int i10) throws Resources.NotFoundException {
        return this.resources.getAnimation(i10);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i10) throws Resources.NotFoundException {
        return this.resources.getBoolean(i10);
    }

    @Override // android.content.res.Resources
    public int getColor(int i10) throws Resources.NotFoundException {
        return this.resources.getColor(i10);
    }

    @Override // android.content.res.Resources
    @RequiresApi(23)
    public int getColor(int i10, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getColor(i10, theme);
    }

    @Override // android.content.res.Resources
    @NotNull
    public ColorStateList getColorStateList(int i10) throws Resources.NotFoundException {
        return this.resources.getColorStateList(i10);
    }

    @Override // android.content.res.Resources
    @RequiresApi(23)
    @NotNull
    public ColorStateList getColorStateList(int i10, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getColorStateList(i10, theme);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Configuration getConfiguration() {
        return this.resources.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i10) throws Resources.NotFoundException {
        return this.resources.getDimension(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i10) throws Resources.NotFoundException {
        return this.resources.getDimensionPixelOffset(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i10) throws Resources.NotFoundException {
        return this.resources.getDimensionPixelSize(i10);
    }

    @Override // android.content.res.Resources
    @Nullable
    public DisplayMetrics getDisplayMetrics() {
        return this.resources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        return this.resources.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int i10, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getDrawable(i10, theme);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int i10, int i11) throws Resources.NotFoundException {
        return this.resources.getDrawableForDensity(i10, i11);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int i10, int i11, @Nullable Resources.Theme theme) {
        return this.resources.getDrawableForDensity(i10, i11, theme);
    }

    @Override // android.content.res.Resources
    @RequiresApi(29)
    public float getFloat(int i10) throws Resources.NotFoundException {
        return this.resources.getFloat(i10);
    }

    @Override // android.content.res.Resources
    @RequiresApi(26)
    @NotNull
    public Typeface getFont(int i10) throws Resources.NotFoundException {
        return this.resources.getFont(i10);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i10, int i11, int i12) throws Resources.NotFoundException {
        return this.resources.getFraction(i10, i11, i12);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return this.resources.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    @NotNull
    public int[] getIntArray(int i10) throws Resources.NotFoundException {
        return this.resources.getIntArray(i10);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i10) throws Resources.NotFoundException {
        return this.resources.getInteger(i10);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getLayout(int i10) throws Resources.NotFoundException {
        return this.resources.getLayout(i10);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Movie getMovie(int i10) throws Resources.NotFoundException {
        return this.resources.getMovie(i10);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int i10, int i11) throws Resources.NotFoundException {
        return this.resources.getQuantityString(i10, i11);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int i10, int i11, @NotNull Object... objArr) throws Resources.NotFoundException {
        return this.resources.getQuantityString(i10, i11, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getQuantityText(int i10, int i11) throws Resources.NotFoundException {
        return this.resources.getQuantityText(i10, i11);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceEntryName(int i10) throws Resources.NotFoundException {
        return this.resources.getResourceEntryName(i10);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceName(int i10) throws Resources.NotFoundException {
        return this.resources.getResourceName(i10);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourcePackageName(int i10) throws Resources.NotFoundException {
        return this.resources.getResourcePackageName(i10);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceTypeName(int i10) throws Resources.NotFoundException {
        return this.resources.getResourceTypeName(i10);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int i10) throws Resources.NotFoundException {
        return this.resources.getString(i10);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int i10, @NotNull Object... objArr) throws Resources.NotFoundException {
        return this.resources.getString(i10, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public String[] getStringArray(int i10) throws Resources.NotFoundException {
        return this.resources.getStringArray(i10);
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getText(int i10) throws Resources.NotFoundException {
        return this.resources.getText(i10);
    }

    @Override // android.content.res.Resources
    @Nullable
    public CharSequence getText(int i10, @Nullable CharSequence charSequence) {
        return this.resources.getText(i10, charSequence);
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence[] getTextArray(int i10) throws Resources.NotFoundException {
        return this.resources.getTextArray(i10);
    }

    @Override // android.content.res.Resources
    public void getValue(int i10, @Nullable TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.resources.getValue(i10, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public void getValue(@Nullable String str, @Nullable TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.resources.getValue(str, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i10, int i11, @Nullable TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.resources.getValueForDensity(i10, i11, typedValue, z10);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getXml(int i10) throws Resources.NotFoundException {
        return this.resources.getXml(i10);
    }

    @Override // android.content.res.Resources
    @Nullable
    public TypedArray obtainAttributes(@Nullable AttributeSet attributeSet, @Nullable int[] iArr) {
        return this.resources.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    @NotNull
    public TypedArray obtainTypedArray(int i10) throws Resources.NotFoundException {
        return this.resources.obtainTypedArray(i10);
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int i10) throws Resources.NotFoundException {
        return this.resources.openRawResource(i10);
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int i10, @Nullable TypedValue typedValue) throws Resources.NotFoundException {
        return this.resources.openRawResource(i10, typedValue);
    }

    @Override // android.content.res.Resources
    @Nullable
    public AssetFileDescriptor openRawResourceFd(int i10) throws Resources.NotFoundException {
        return this.resources.openRawResourceFd(i10);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(@Nullable String str, @Nullable AttributeSet attributeSet, @Nullable Bundle bundle) throws XmlPullParserException {
        this.resources.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(@Nullable XmlResourceParser xmlResourceParser, @Nullable Bundle bundle) throws XmlPullParserException, IOException {
        this.resources.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    @RequiresApi(30)
    public void removeLoaders(@NotNull ResourcesLoader... resourcesLoaderArr) {
        this.resources.removeLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(@Nullable Configuration configuration, @Nullable DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.resources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
