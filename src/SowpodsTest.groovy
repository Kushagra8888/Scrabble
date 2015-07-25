/**
 * Created by test on 7/25/2015.
 */
class SowpodsTest extends GroovyTestCase {
    void testGetValidWords() {
        Sowpods sowpods = new Sowpods()
        def validWords = sowpods.getValidWords("a")
        def validWordsAsArray = validWords as String[]
        assert validWords instanceof String[]
        assert validWords == ['a']
    }

    void testSortWord() {
        Sowpods sowpods = new Sowpods();

    }
}
