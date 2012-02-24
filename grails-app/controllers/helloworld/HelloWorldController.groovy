package helloworld


class HelloWorldController {
    Greeter helloClient
    def index() {
        def serviceException
        def gResponse
        try {
            gResponse = helloClient.greetMe('me')
        } catch (Exception e)  {
            serviceException = e
        }

        render(view: "index", model: [resp:gResponse.toString(), ex:serviceException])
    }
}
