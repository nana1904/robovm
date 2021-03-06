/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.audiotoolbox;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioFileMarker/*</name>*/ 
    extends /*<extends>*/Struct<AudioFileMarker>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioFileMarkerPtr extends Ptr<AudioFileMarker, AudioFileMarkerPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AudioFileMarker() {}
    public AudioFileMarker(double mFramePosition, String mName, int mMarkerID, AudioFileSMPTETime mSMPTETime, int mType, short mReserved, short mChannel) {
        this.setMFramePosition(mFramePosition);
        this.setMName(mName);
        this.setMMarkerID(mMarkerID);
        this.setMSMPTETime(mSMPTETime);
        this.setMType(mType);
        this.setMReserved(mReserved);
        this.setMChannel(mChannel);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native double getMFramePosition();
    @StructMember(0) public native AudioFileMarker setMFramePosition(double mFramePosition);
    @StructMember(1) public native String getMName();
    @StructMember(1) public native AudioFileMarker setMName(String mName);
    @StructMember(2) public native int getMMarkerID();
    @StructMember(2) public native AudioFileMarker setMMarkerID(int mMarkerID);
    @StructMember(3) public native @ByVal AudioFileSMPTETime getMSMPTETime();
    @StructMember(3) public native AudioFileMarker setMSMPTETime(@ByVal AudioFileSMPTETime mSMPTETime);
    @StructMember(4) public native int getMType();
    @StructMember(4) public native AudioFileMarker setMType(int mType);
    @StructMember(5) public native short getMReserved();
    @StructMember(5) public native AudioFileMarker setMReserved(short mReserved);
    @StructMember(6) public native short getMChannel();
    @StructMember(6) public native AudioFileMarker setMChannel(short mChannel);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
