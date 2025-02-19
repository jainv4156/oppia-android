package org.oppia.android.app.topic

/** Listener for when an [TopicActivity] should route to a [StoryActivity]. */
interface RouteToStoryListener {
  fun routeToStory(internalProfileId: Int, classroomId: String, topicId: String, storyId: String)
}
