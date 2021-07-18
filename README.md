# armament-locator-service



## intro

This project intended to be a proof-of-concept for detection of armament usage from images of aircrafts.



## Algorithm

The algorithm is pretty naive and will based on image comparison.  

1. **aircraft detection** - apply object detection to locate the aircraft inside a bounding box.
2. **filtering** - apply classic computer vision techniques to reduce the noise. 
3. **compute delta** - compute the delta between the "post-flight" and "pre-flight" images to detect ROI (regions of interest)
4. **locate the missing armaments** - by the location of the ROI