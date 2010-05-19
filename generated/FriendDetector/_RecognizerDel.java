// **********************************************************************
//
// Copyright (c) 2003-2009 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.3.1

package FriendDetector;

public interface _RecognizerDel extends Ice._ObjectDel
{
    Face[] findFacesAndRecognizePeople(byte[] jpegFile, UID userid, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    Face[] findFaces(byte[] jpegFile, UID userid, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    String recognizeFace(byte[] jpegFileOfFace, UID userid, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void learn(byte[] jpegFileOfFace, String name, UID userid, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    int getTrainSetSize(UID userid, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    FacePictureWithName getTrainSetFace(int num, UID userid, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    void unLearn(int id, UID userid, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}
