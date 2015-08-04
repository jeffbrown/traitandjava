package demo

class BirdKeeperSpec extends spock.lang.Specification {

    void 'test releasing a bird'() {
        given:
        def keeper = new BirdKeeper()

        expect:
        'I Am Flying' == keeper.releaseBird()
    }
}
