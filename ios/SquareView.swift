import SwiftUI

struct SquareView: View {
    var width: CGFloat
    var height: CGFloat

    var body: some View {
        VStack {
            Text("Haha")
                .frame(width: width, height: height)
                .background(.red)
                .border(/*@START_MENU_TOKEN@*/Color.black/*@END_MENU_TOKEN@*/, width: /*@START_MENU_TOKEN@*/1/*@END_MENU_TOKEN@*/)
                .cornerRadius(8)
        }
    }
}
