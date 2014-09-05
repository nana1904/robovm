/*
 * Copyright (C) 2014 Trillian Mobile AB
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
package org.robovm.apple.coretext;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreText")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTFrameClippingPath/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    private CFDictionary data = CFMutableDictionary.create();
    
    public CTFrameClippingPath(CGPath path) {
        setPath(path);
    }
    protected CTFrameClippingPath(CFDictionary data) {
        this.data = data;
    }
    /*<bind>*/static { Bro.bind(CTFrameClippingPath.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    protected CFDictionary getDictionary() {
        return data;
    }
    
    public CGPath getPath() {
        if (data.containsKey(Path())) {
            CGPath val = data.get(Path(), CGPath.class);
            return val;
        }
        return null;
    }
    public void setPath(CGPath path) {
        data.put(Path(), path);
    }
    /*<methods>*/
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalValue(symbol="kCTFramePathClippingPathAttributeName", optional=true)
    protected static native CFString Path();
    /*</methods>*/
}