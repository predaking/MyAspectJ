package com.example.lw.appline.com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Command
  implements Parcelable
{
  public static final Creator<Command> CREATOR = new Creator()
  {
    public Command a(Parcel paramAnonymousParcel)
    {
      return new Command(paramAnonymousParcel);
    }
    
    public Command[] a(int paramAnonymousInt)
    {
      return new Command[paramAnonymousInt];
    }
  };
  private String a;
  private String b;
  private String c;
  
  public Command() {}
  
  Command(Parcel paramParcel)
  {
    a(paramParcel);
  }
  
  public Command(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
  }
  
  private void a(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.Command
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */