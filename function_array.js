var cards;
(function (cards) {
    cards[cards["heart"] = 0] = "heart";
    cards[cards["claver"] = 1] = "claver";
    cards[cards["spade"] = 2] = "spade";
    cards[cards["diamond"] = 3] = "diamond";
})(cards || (cards = {}));
console.log(cards);
