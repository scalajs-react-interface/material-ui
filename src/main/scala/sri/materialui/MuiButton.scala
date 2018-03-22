package sri.materialui


import sri.core._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault, OptionalParam, DangerousUnionToJSAnyImplicit}
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|





 @js.native
 @JSImport("material-ui/Button",JSImport.Default)
object MuiButtonComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiButton {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
href : OptionalParam[String] = OptDefault,
disableFocusRipple : OptionalParam[Boolean] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
dense : OptionalParam[Boolean] = OptDefault,
color : OptionalParam[MuiButtonColor] = OptDefault,
disableRipple : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
fab : OptionalParam[Boolean] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
`type` : OptionalParam[String] = OptDefault,
raised : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiButtonComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiButtonComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiButtonComponent.type](
      MuiButtonComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiButtonC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiButtonComponent.type](
      MuiButtonComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         
 @js.native
 trait MuiButtonColor extends js.Object

 object MuiButtonColor{
   @inline def DEFAULT = "default".asInstanceOf[MuiButtonColor] 
@inline def INHERIT = "inherit".asInstanceOf[MuiButtonColor] 
@inline def PRIMARY = "primary".asInstanceOf[MuiButtonColor] 
@inline def ACCENT = "accent".asInstanceOf[MuiButtonColor] 
@inline def CONTRAST = "contrast".asInstanceOf[MuiButtonColor] 
          }



     

         
